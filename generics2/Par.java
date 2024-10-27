package generics2;

public class Par<C extends Number, V> implements Comparable<Par<C, V>> {
    private final C chave;
    private final V valor;

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    @Override
    public int compareTo(Par<C, V> outro) {
        // Defina a lógica de comparação para ordenar os pares
        // Supondo que queremos ordenar pela chave
        return Double.compare(chave.doubleValue(), outro.getChave().doubleValue());
    }

    @Override
    public int hashCode() {
        // Implementação do hashCode
        return chave.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Par<?, ?> par = (Par<?, ?>) obj;
        return chave.equals(par.chave);
    }
}