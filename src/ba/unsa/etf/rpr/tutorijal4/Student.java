
package ba.unsa.etf.rpr.tutorijal4;

public class Student
{
    private String ime;
    private String prezime;
    private Integer broj_indeksa;

    public Integer getBroj_indeksa() {
        return broj_indeksa;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }

    public Student(String ime_st, String prez_st, Integer br_ind)
    {
            ime= ime_st;
            prezime=prez_st;
            broj_indeksa=br_ind;
    }

    public Student(Student st)
    {
        ime= st.ime;
        prezime= st.prezime;
        broj_indeksa = st.broj_indeksa;
    }

}
