package tarefa05.entities;

public class Matrix {

    private Integer linha;
    private Integer coluna;

    public Matrix(Integer linha, Integer coluna) {

        this.linha = linha;
        this.coluna = coluna;
    }

    public Integer findUp(Integer[][] matrix) {

        if(linha != null) {
            if(linha == 0) {
                return null;
            } else {
                return matrix[linha - 1][coluna];
            }
        }

        return null;
    }

    public Integer findDown(Integer[][] matrix) {

        if(linha != null) {
            if(linha == matrix.length - 1) {
                return null;
            } else {
                return matrix[linha + 1][coluna];
            }
        }

        return null;
    }

    public Integer findLeft(Integer[][] matrix) {

        if(coluna != null) {
            if(coluna == 0) {
                return null;
            } else {
                return matrix[linha][coluna - 1];
            }
        }

        return null;
    }

    public Integer findRight(Integer[][] matrix) {

        if(coluna != null) {
            if(coluna == matrix[0].length - 1) {
                return null;
            } else {
                return matrix[linha][coluna + 1];
            }
        }

        return null;
    }
    
}
