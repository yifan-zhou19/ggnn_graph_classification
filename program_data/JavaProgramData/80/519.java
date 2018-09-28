package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int i;
		int j;
		int[] mouth1 = new int[13];
		int[] mouth2 = new int[13];
		int[] p = mouth1; //????
		int[] q = mouth2;
		p[0] = 0;
		p[1] = 31;
		p[2] = 28;
		p[3] = 31;
		p[4] = 30;
		p[5] = 31;
		p[6] = 30;
		p[7] = 31;
		p[8] = 31;
		p[9] = 30;
		p[10] = 31;
		p[11] = 30;
		p[12] = 31;
		q[0] = 0;
		q[1] = 31;
		q[2] = 29;
		q[3] = 31;
		q[4] = 30;
		q[5] = 31;
		q[6] = 30;
		q[7] = 31;
		q[8] = 31;
		q[9] = 30;
		q[10] = 31;
		q[11] = 30;
		q[12] = 31; //??
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				n1 += 366;
			}
			else
			{
				n1 += 365; //???
			}
		}
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			for (j = 0;j < m2;j++)
			{
				n2 += q[j];
			}
		}
		else
		{
			for (j = 0;j < m2;j++)
			{
				n2 += p[j];
			}
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
				for (j = 0;j < m1;j++)
				{
					n2 -= q[j];
				}
		}
			else
			{
				for (j = 0;j < m1;j++)
				{
					n2 -= p[j]; //????????
				}
			}
		n3 = d2 - d1; //???
		int sum = n1 + n2 + n3; //??
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}



}

