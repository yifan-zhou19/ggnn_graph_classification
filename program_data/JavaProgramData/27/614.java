package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j = 1;
		int n;
		int i;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double t;
		double p;
		double q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (j <= n)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			t = b * b - 4 * a * c;
			if (t > 0)
			{
				x1 = (0 - b + Math.sqrt(t)) / (2 * a);
				x2 = (0 - b - Math.sqrt(t)) / (2 * a);
				//cout<<"x1="<<printf("%.5f", x1)<<";"<<"x2="<<printf("%.5f", x2)<<endl;
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if (t == 0)
			{
				x1 = (0 - b) / (2 * a);
				//cout<<"x1=x2="<<printf("%.5f", x1)<<endl;
				System.out.printf("x1=x2=%.5lf\n", x1);
			}
			if (t < 0)
			{
				p = (0 - b) / (2 * a);
				q = Math.sqrt(-1 * t) / (2 * a);
				//cout<<"x1="<<printf("%.5f", x1)<<";"<<"x2="<<printf("%.5f", x2)<<endl;
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
			}
			j++;
		}
		return 0;
	}
}

