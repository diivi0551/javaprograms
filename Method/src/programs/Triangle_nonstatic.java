package programs;
public class Triangle_nonstatic {
    public void main(String[] args) {
				new Area().trian();
				System.out.println(" "+new Area().a);
			}
		}
		class Area
		{
			int l=5;
			int b=1;
			double a=0.5*l*b;
			void trian()
			{
				System.out.println("the area of triangle is : ");
			}
		}
