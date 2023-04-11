import java.io.Serializable;

public class Let implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;
  private boolean isRedirected;
  private Long timeOfLanding;

  public Let() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  } 

  public boolean getIsRedirected() {
    return isRedirected;
  }

  public void setIsRedirected(boolean isRedirected) {
    this.isRedirected = isRedirected;
  }

  public Long getTimeOfLanding() {
    return timeOfLanding;
  }

  public void setTimeOfLanding(Long timeOfLanding) {
    this.timeOfLanding = timeOfLanding;
  }
}
