package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    private Address address;
    private String name;
    private Long id;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person() {
    }
    public Person(Long id, String name, Address address) {
       this.name = name;
       this.id = id;
       this.address = address;

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean) o;
    }
}