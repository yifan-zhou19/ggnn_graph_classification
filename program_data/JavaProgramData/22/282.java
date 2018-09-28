package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[2000]);
		int[] b = new int[300];
		int t = 0;
		int n;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
			{
				t = t * 10 + a.charAt(i) - 48;

			}
			else
			{
				b[j] = t;
				j++;
				t = 0;
			}
		}
		b[j] = t;
		j++;
		for (i = 1;i < j;i++)
		{
			for (t = 0;t < j - i;t++)
			{
				if (b[t] < b[t + 1])
				{
					n = b[t];
					b[t] = b[t + 1];
					b[t + 1] = n;
				}
			}
		}
		for (i = 1;i < j;i++)
		{
			  if (b[i] != b[i - 1])
			  {
				  System.out.printf("%d",b[i]);
				  break;
			  }

			  else
			  {
				  continue;
			  }
		}
		if (b[0] == b[j - 1])
		{
			System.out.print("No");
		}

	}
}

