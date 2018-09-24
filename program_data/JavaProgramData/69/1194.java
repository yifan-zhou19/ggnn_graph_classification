package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] na = new int[MAX_LEN + 10];
		int[] nb = new int[MAX_LEN + 10];
		String a = new String(new char[MAX_LEN + 10]);
		String b = new String(new char[MAX_LEN + 10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(na, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(nb, 0, (Integer.SIZE / Byte.SIZE));

		int n1 = a.length();
		j = 0;
		for (i = n1 - 1;i >= 0;i--)
		{
			na[j++] = a.charAt(i) - '0';
		}

		int n2 = b.length();
		j = 0;
		for (i = n2 - 1;i >= 0;i--)
		{
			nb[j++] = b.charAt(i) - '0';
		}

		 for (i = 0;i < MAX_LEN;i++)
		 {
			 na[i] += nb[i];
			 if (na[i] >= 10)
			 {
					na[i] -= 10;
					na[i + 1]++;
			 }
		 }
		 int flag = 0;
		 for (i = MAX_LEN; i >= 0; i--)
		 {
			 if (flag == 1)
			 {
				 System.out.printf("%d", na[i]);
			 }
			  else if (na[i])
			  {
				   System.out.printf("%d", na[i]);
				   flag = 1;
			  }
		 }
		 if (flag != 1)
		 {
			  System.out.print("0");
		 }
		 return 0;
	}

}

