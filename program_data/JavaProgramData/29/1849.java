package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int a;
		int b;
		float m1 = 2F;
		float n1 = 1F;
		float m2 = 3F;
		float n2 = 2F;
		float temp1;
		float temp2;
		float sum = 0F;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= a;i++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1;j <= b;j++)
			{
			sum += (m1 / n1);
			temp1 = m1;
			temp2 = n1;
			m1 = m2;
			n1 = n2;
			m2 += temp1;
			n2 += temp2;
			}
			System.out.printf("%.3f\n",sum);
			m1 = 2F;
			n1 = 1F;
			m2 = 3F;
			n2 = 2F;
			sum = 0F;


		}


		return 0;
	}

}

