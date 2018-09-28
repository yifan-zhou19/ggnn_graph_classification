package <missing>;

public class GlobalMembers
{
	//***************************
	//* @author ??          **
	//* @date 2012-09-26       ** 
	//* @description ?????   **
	//***************************
	public static int Main() //?????
	{
		int n; //????
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
		//cout<<"?????"<<endl;   //??
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m = new int[100]; //????
		//cout<<"???????"<<endl;   //??
		for (i = 1; i <= n; i++) //????
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m[i] <= 18) //????
			{
				a++;
			}
			else if (m[i] <= 35)
			{
				b++;
			}
			else if (m[i] <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		//cout<<"????????"<<endl;
	  System.out.printf("%.2f", "1-18: ");
	  System.out.printf("%.2f", (double)a / n * 100);
	  System.out.print("%%");
	  System.out.printf("%.2f", "\n");
	  System.out.printf("%.2f", "19-35: ");
	  System.out.printf("%.2f", (double)b / n * 100);
	  System.out.print("%%");
	  System.out.printf("%.2f", "\n");
	  System.out.printf("%.2f", "36-60: ");
	  System.out.printf("%.2f", (double)c / n * 100);
	  System.out.print("%%");
	  System.out.printf("%.2f", "\n");
	  System.out.printf("%.2f", "60??: ");
	  System.out.printf("%.2f", (double)d / n * 100);
	  System.out.print("%%");
	  System.out.printf("%.2f", "\n");
	  return 0; //?????
	}
}

