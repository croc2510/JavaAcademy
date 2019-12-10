package ejercicio6;

public class State {
	private String state_id;
	private String state;
	private String shipping_zone_id;
	public String getState_id() {
		return state_id;
	}
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getShipping_zone_id() {
		return shipping_zone_id;
	}
	public void setShipping_zone_id(String shipping_zone_id) {
		this.shipping_zone_id = shipping_zone_id;
	}
	@Override
	public String toString() {
		return "State [state_id=" + state_id + ", state=" + state + ", shipping_zone_id=" + shipping_zone_id + "]";
	}
	
	
	
	
}
