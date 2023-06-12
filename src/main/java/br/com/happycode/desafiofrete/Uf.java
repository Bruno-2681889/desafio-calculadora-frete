package br.com.happycode.desafiofrete;

public enum Uf {

    RO("Rondônia"),
    AC("Acre"),
    AM("Amazonas"),
    RR("Roraima"),
    PA("Pará"),
    AP("Amapá"),
    TO("Tocantins"),
    MA("Maranhão"),
    PI("Piauí"),
    CE("Ceara"),
    RN("Rio Grande do norte"),
    PB("Paraiba"),
    PE("Pernambuco"),
    AL("Alagoas"),
    SE("Sergipe"),
    BA("Bahia"),
    MG("Minas Gerais"),
    ES("Espirito Santo"),
    RJ("Rio de Janeiro"),
    SP("São Paulo"),
    PR("Parana"),
    SC("Santa Catarina"),
    RS("Rio Grande do Sul"),
    MS("Mato Grosso do Sul"),
    MT("Mato Grosso"),
    GO("Goias"),
    DF("Distrito Federal");

    private String uf;

    Uf(String UF) {
        this.uf = UF;
    }

    public String getUf() {
        return uf;
    }
}
