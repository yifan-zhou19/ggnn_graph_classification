package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[260]);
		String s2 = new String(new char[260]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		int i;
		int[] a1 = new int[260];
		int m1;
		int m2;
		int[] a2 = new int[260];
		for (i = 0;i < 260;i++)
		{
		a1[i] = 0;
		}
		 for (i = 0;i < 260;i++)
		 {
		a2[i] = 0;
		 }

		m1 = s1.length();
		 m2 = s2.length();
	   for (i = 0;i < m1;i++)
	   {
	   a1[m1 - i - 1] = s1.charAt(i) - '0';
	   }
		  for (i = 0;i < m2;i++)
		  {
	   a2[m2 - i - 1] = s2.charAt(i) - '0';
		  }
	   if (m2 > m1)
	   {
	   m1 = m2;
	   }
		for (i = 0;i < m1;i++)
		{
						 a1[i] = a1[i] + a2[i];
						 if (a1[i] > 9)
						 {
									a1[i] = a1[i] - 10;
									a1[i + 1] = a1[i + 1] + 1;
						 }
		}
						 int s = -1;
	  for (i = m1;i >= 0;i--)
	  {
		  if (a1[i] != 0)
		  {
		  s = i;
	  break;
		  }
	  }
	  if (s == -1)
	  {
	  System.out.print("0");
	  }
	 else
	 {
			 for (i = s;i >= 0;i--)
			 {
					   System.out.printf("%d",a1[i]);
			 }
	 }
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

