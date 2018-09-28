package <missing>;

public class GlobalMembers
{
	public static int ten(int m)
	{
			int z;
		  if (48 <= m != 0 && m <= 57)
		  {
			 z = m - 48;
		  }
		  else if (65 <= m != 0 && m <= 90)
		  {
			 z = m - 55;
		  }
		  else if (97 <= m != 0 && m <= 122)
		  {
			 z = m - 87;
		  }
		  return (z);
	}
		public static char letter(int p)
		{
			int k;
		   if (0 <= p != 0 && p <= 9)
		   {
		   k = p + 48;
		   }
		   else if (10 <= p != 0 && p <= 26)
		   {
		   k = p + 55;
		   }
		   return (k);
		}
	public static int Main()
	{
		int a1;
		int b1;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int tensum = 0;
		int n;
		int i;
		int a1_;
		a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a1_ = a1;
		System.in.read();
		for (i = 1;i <= 1000;i++)
		{
		a[i] = System.in.read();
		if (a[i] == 32)
		{
		break;
		}
		}
		n = i - 1;
		b1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		tensum = ten(a[n]);
		for (i = n - 1;i > 0;i--)
		{
			tensum = a1_ * ten(a[i]) + tensum;
		a1_ = a1_ * a1;
		}
		i = 1;
		do
		{
		b[i] = tensum % b1;
		tensum = tensum / b1;
		i++;
		} while (tensum > 0);
		for (i = i - 1;i > 0;i--)
		{
		System.out.print(letter(b[i]));
		}
		return 0;
	}


}

