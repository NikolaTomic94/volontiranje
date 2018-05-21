package controlers;

import beans.Drzavljanstvo;
import beans.Mesto;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

@ManagedBean
public class RegistracijaVolonter {

    private String imePrezime;

    private Date datumRodjenja;
    private boolean uslov;
    private String pol;
    private SelectItem drzavljanstvo;
    private String telefon;
    private String ulica_broj;
    private SelectItem mesto;
    private String mail;
    private String lozinka;
    private String slika;
    private String cv;
    private String status;
    private String kompanija;
    private String sedisteKompanije;
    private String pozicijaUKompaniji;
    private String nazivSkole;
    private String sedisteSkole;
    private String nivoStudija;
    private String godinaUpisa;
    
    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumrodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public boolean isUslov() {
        return uslov;
    }

    public void setUslov(boolean uslov) {
        this.uslov = uslov;
    }
    
    private List<SelectItem> svaMesta = new LinkedList<>();

    public List<SelectItem> getSvaMesta() {
        return svaMesta;
    }
    
    
    private List<SelectItem> svaDrzavljanstva = new LinkedList<>();
    public List<SelectItem> getSvaDrzavljanstva() {
        return svaDrzavljanstva;
    }

    @PostConstruct
    public void init() {
        List<Drzavljanstvo> svaDrzavljanstvaBinovi = Drzavljanstvo.ucitajSvaDrzavljanstva();
        
        for (Drzavljanstvo drzavljanstvo : svaDrzavljanstvaBinovi) {
            svaDrzavljanstva.add(new SelectItem(drzavljanstvo.getIddrz(), drzavljanstvo.getDrzavljanstvo()));
        }
        List<Mesto> svaMestaBinovi = Mesto.ucitajSvaMesta();
        for (Mesto mesto: svaMestaBinovi){
            svaMesta.add(new SelectItem(mesto.getId(),mesto.getNazivMesta()));
        } 
    }
    
    
    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    private static Map<String, String> polovi;

    static {
        polovi = new LinkedHashMap<>();
        polovi.put("Zensko", "Z");
        polovi.put("Musko", "M");

    }

    public Map<String, String> getPolovi() {
        return polovi;
    }

    public void setPolovi(Map<String, String> polovi) {
        RegistracijaVolonter.polovi = polovi;
    }

    public SelectItem getDrzavljanstvo() {
        return drzavljanstvo;
    }

    public void setDrzavljanstvo(SelectItem drzavljanstvo) {
        this.drzavljanstvo = drzavljanstvo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return ulica_broj;
    }

    public void setAdresa(String adresa) {
        this.ulica_broj = adresa;
    }

    public String getUlicaibroj() {
        return ulica_broj;
    }

    public void setUlicaibroj(String ulicaibroj) {
        this.ulica_broj = ulicaibroj;
    }

    public SelectItem getMesto() {
        return mesto;
    }

    public void setMesto(SelectItem mesto) {
        this.mesto = mesto;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUlica_broj() {
        return ulica_broj;
    }

    public void setUlica_broj(String ulica_broj) {
        this.ulica_broj = ulica_broj;
    }

    public String getKompanija() {
        return kompanija;
    }

    public void setKompanija(String kompanija) {
        this.kompanija = kompanija;
    }

    public String getSedisteKompanije() {
        return sedisteKompanije;
    }

    public void setSedisteKompanije(String sedisteKompanije) {
        this.sedisteKompanije = sedisteKompanije;
    }

    public String getPozicijaUKompaniji() {
        return pozicijaUKompaniji;
    }

    public void setPozicijaUKompaniji(String pozicijaUKompaniji) {
        this.pozicijaUKompaniji = pozicijaUKompaniji;
    }

    public String getNazivSkole() {
        return nazivSkole;
    }

    public void setNazivSkole(String nazivSkole) {
        this.nazivSkole = nazivSkole;
    }

    public String getSedisteSkole() {
        return sedisteSkole;
    }

    public void setSedisteSkole(String sedisteSkole) {
        this.sedisteSkole = sedisteSkole;
    }

    public String getNivoStudija() {
        return nivoStudija;
    }

    public void setNivoStudija(String nivoStudija) {
        this.nivoStudija = nivoStudija;
    }

    public String getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(String godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

   

  
    public void RegistrujVolontera() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Uspesno ste se registrovali."));

    }

}