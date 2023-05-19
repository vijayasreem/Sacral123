·       System should take user to the sub screen of edit, view, download.·       User should be able to access the sub functionalities like edit, view and download.·       User should be able to download the branches as format of .csv file.·       User should have Submit and Reset buttons on this screen·       Once User have made User selections click on Submit it will add/edit the publication, or click on Reset to reset the selections to the last search.

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    List<Publisher> findByName(String name);

    Optional<Publisher> findById(Long id);

    List<Publisher> findByActiveTrue();

    List<Publisher> findByNameAndActiveTrue(String name);

    List<Publisher> findByNameAndActiveFalse(String name);

    @Query("select p from Publisher p where p.name = :name and p.active = :active")
    List<Publisher> findByNameAndActive(@Param("name") String name, @Param("active") boolean active);

    @Query("select p from Publisher p where p.active = :active")
    List<Publisher> findByActive(@Param("active") boolean active);

    @Modifying
    @Query("update Publisher p set p.name = :name, p.active = :active where p.id = :id")
    void updatePublisher(@Param("id") Long id, @Param("name") String name, @Param("active") boolean active);

    @Modifying
    @Query("delete from Publisher p where p.id = :id")
    void deletePublisher(@Param("id") Long id);

}