package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int i;
		int j;
		String s = new String(new char[500]);
		int[] d = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		a = s.length();
		if (n == 3)
		{
			for (i = 0;i < a - 2;i++)
			{
						  for (j = 0;j < a - 2;j++)
						  {
						  if (s.charAt(j) == s.charAt(i) && s.charAt(j + 1) == s.charAt(i + 1) && s.charAt(j + 2) == s.charAt(i + 2))
						  {
						  d[i]++;
						  }
						  }

			}
		b = 0;
		for (i = 0;i < a - 2;i++)
		{
						  if (b < d[i])
						  {
						  b = d[i];
						  }
		}
						  if (b == 1)
						  {
						  System.out.print("NO");
						  }
						  else
						  {
						  System.out.printf("%d\n",b);
			for (i = 0;i < a - 2;i++)
			{
			if (d[i] == b)
			{
					   System.out.printf("%c%c%c\n",s.charAt(i),s.charAt(i + 1),s.charAt(i + 2));
						for (j = 0;j < a - 2;j++)
						{
						  if (s.charAt(j) == s.charAt(i) && s.charAt(j + 1) == s.charAt(i + 1) && s.charAt(j + 2) == s.charAt(i + 2))
						  {
						  d[j] = 0;
						  }
						}
			}
			}
						  }
		}
		 if (n == 2)
		 {
			   for (i = 0;i < a - 1;i++)
			   {
						  for (j = 0;j < a - 1;j++)
						  {
						  if (s.charAt(j) == s.charAt(i) && s.charAt(j + 1) == s.charAt(i + 1))
						  {
						  d[i]++;
						  }
						  }

			   }
		b = 0;
		for (i = 0;i < a - 1;i++)
		{
						  if (b < d[i])
						  {
						  b = d[i];
						  }
		}
							if (b == 1)
							{
						  System.out.print("NO");
							}
						  else
						  {
						  System.out.printf("%d\n",b);
			for (i = 0;i < a - 1;i++)
			{
			if (d[i] == b)
			{
					   System.out.printf("%c%c\n",s.charAt(i),s.charAt(i + 1));
						for (j = 0;j < a - 1;j++)
						{
						  if (s.charAt(j) == s.charAt(i) && s.charAt(j + 1) == s.charAt(i + 1))
						  {
						  d[j] = 0;
						  }
						}
			}
			}
						  }
		 }
			 if (n == 4)
			 {
			for (i = 0;i < a - 3;i++)
			{
						  for (j = 0;j < a - 3;j++)
						  {
						  if (s.charAt(j) == s.charAt(i) && s.charAt(j + 1) == s.charAt(i + 1) && s.charAt(j + 2) == s.charAt(i + 2) && s.charAt(j + 3) == s.charAt(i + 3))
						  {
						  d[i]++;
						  }
						  }

			}
		b = 0;
		for (i = 0;i < a - 3;i++)
		{
						  if (b < d[i])
						  {
						  b = d[i];
						  }
		}
							if (b == 1)
							{
						  System.out.print("NO");
							}
						  else
						  {
						  System.out.printf("%d\n",b);
			for (i = 0;i < a - 3;i++)
			{
			if (d[i] == b)
			{
					   System.out.printf("%c%c%c%c\n",s.charAt(i),s.charAt(i + 1),s.charAt(i + 2),s.charAt(i + 3));
						for (j = 0;j < a - 3;j++)
						{
						  if (s.charAt(j) == s.charAt(i) && s.charAt(j + 1) == s.charAt(i + 1) && s.charAt(j + 2) == s.charAt(i + 2) && s.charAt(j + 3) == s.charAt(i + 3))
						  {
						  d[j] = 0;
						  }
						}
			}
			}
						  }
			 }


	}

}

