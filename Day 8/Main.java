public class Main {

	public static void main(String[] args) {
		
		doctor[] d=new doctor[3];
		engineer[] e=new engineer[3];
		pilot[] p=new pilot[3];
		
		for(int i=0;i<3;i++)
		{
			d[i]=new doctor();
			e[i]=new engineer();
			p[i]=new pilot();
			
		}
		System.out.println("From Doctor");
		for(int i=0;i<3;i++)
		{			
			d[i].getDetail();
			d[i].displayDetail();
		}
		System.out.println("From Engineer");
		for(int i=0;i<3;i++)
		{
			
			e[i].getDetail();
			e[i].displayDetail();
		}
		System.out.println("From Pilot");
		for(int i=1;i<3;i++)
		{
			p[i].getDetail();
			p[i].displayDetail();
		}
		

	}

}
