/**
 * Classe Size - Tamanho dos copos
 *
 *
 *
 * @author MatheusSnts
 * @version 1.0
 */
public enum Size{
    SMALL(32, 36, "Pequeno",'S'),
    MEDIUM(37, 44, "Médio",'M'),
    LARGE(45, 52, "Grande",'L');
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
    /**
     * Construtor da classe Size
     * @param minValue valor mínimo
     * @param maxValue valor máximo
     * @param description descrição
     * @param code caractere do tamanho
     */
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }
    /**
     * Método toString()
     * @return Retorna a String description
     */
    @Override
    public String toString() {
    return this.description;
    }
    /**
     * Método getDescription()
     * @return descrição
     */
    public String getDescription() {
    return description;
    }
    /**
     * Método getMinValue()
     * @return valor mínimo
     */
    public int getMinValue() {
    return minValue;
    }
    /**
     * Método getMaxValue()
     * @return valor máximo
     */
    public int getMaxValue() {
    return maxValue;
    }
    /**
     * Método getCode()
     * @return caractere do tamanho
     */
    public char getCode() {
    return code;
    }
}