package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int n;
		int k;
		int h;
		int z;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (h = 0;h < k;h++)
		{
			z = 0;
			a = new Scanner(System.in).nextLine();
			n = a.length();
			for (i = 0;i < n;i++)
			{
				t = 1;
				for (j = 0;j < i;j++)
				{
					  if (a.charAt(i) == a.charAt(j))
					  {
						  t = 0;
					  }
				}
				for (j = i + 1;j < n;j++)
				{
					  if (a.charAt(i) == a.charAt(j))
					  {
						  t = 0;
					  }
				}
				if (t == 1)
				{
					  System.out.printf("%c\n",a.charAt(i));
					  z++;
					  break;
				}
			}
			if (z == 0)
			{
				System.out.print("no\n");
			}
		}
	}

}

