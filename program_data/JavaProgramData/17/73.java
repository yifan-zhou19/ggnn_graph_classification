package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[120];
		String s = new String(new char[120]);
		String s1 = new String(new char[120]);
		int i;
		int j;
		int k;
		int m;
		int n;
		int l;
		while (true)
		{
			s = new Scanner(System.in).nextLine();
			if (strcmp(s,s1) == 0)
			{
				break;
			}
			s1 = s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			l = s.length();
			for (i = 0;i < l;i++)
			{
			if (s.charAt(i) == '(')
			{
				a[i] = 1;
			}
			if (s.charAt(i) == ')')
			{
				a[i] = -1;
			}
			}

			for (i = 0;i < l;i++)
			{
				if ((s.charAt(i) == '(') && (a[i] != 0))
				{
				  j = i + 1;
				  while ((a[j] == 0) && (j < l))
				  {
					  j++;
				  }
				  if ((s.charAt(j) == ')') && (a[j] != 0))
				  {
					a[i] = 0;
					a[j] = 0;
				  }
				}
				if ((s.charAt(i) == ')') && (a[i] != 0))
				{
				  j = i - 1;
				  while ((a[j] == 0) && (j > 0))
				  {
					  j--;
				  }
				  if ((s.charAt(j) == '(') && (a[j] != 0))
				  {
					a[i] = 0;
					a[j] = 0;
				  }
				}
			}
			System.out.printf("%s\n",s);
			for (i = 0;i < l;i++)
			{
				if (a[i] == 1)
				{
					System.out.print("$");
				}
			else if (a[i] == -1)
			{
				System.out.print("?");
			}
			else
			{
				System.out.print(" ");
			}
			}
			System.out.print("\n");
		}

			return 0;
	}


}
