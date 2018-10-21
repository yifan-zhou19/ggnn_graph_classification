package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int n;
		 int m;
		 int temp;
		 int[] arrive = new int[1500];
		 int[] leave = new int[1500];
		 int[] times = new int[1001];
		 char c;
		 c = System.in.read();
		 while (c != EOF)
		 {
		   n = 0;
		   while ((c != '\n') && (c != EOF)) // ???1?
		   {
			 m = c - '0';
			 temp = 0;
			 while ((m <= 9) && (m >= 0))
			 {
			   temp = temp * 10 + m;
			   c = System.in.read();
			   m = c - '0';
			 }
			  arrive[n] = temp;
			  n++;
			  if (c == ',')
			  {
				c = System.in.read();
			  }
		   }
		   c = System.in.read();
		   n = 0;
		   while ((c != '\n') && (c != EOF)) // ???1?
		   {
			 m = c - '0';
			 temp = 0;
			 while ((m <= 9) && (m >= 0))
			 {
			   temp = temp * 10 + m;
			   c = System.in.read();
			   m = c - '0';
			 }
			  leave[n] = temp;
			  n++;
			  if (c == ',')
			  {
				  c = System.in.read();
			  }
		   }
		for (i = 0;i < n;i++)
		{
			for (j = arrive[i];j < leave[i];j++)
			{
				times[j]++;
			}
		}
		int max = 0;
		for (i = 0;i < 1000;i++)
		{
			if (max < times[i])
			{
				max = times[i];
			}
		}
		System.out.printf("%d %d\n",n,max);
			 while (c == '\n')
			 {
			  c = System.in.read();
			 }
		 }

	}
}
