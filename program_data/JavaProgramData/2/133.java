public class book
{
	public int num;
	public String zhuzhe = new String(new char[26]);
	public int let;
}

package <missing>;

public class GlobalMembers
{
	public static book[] shu = tangible.Arrays.initializeWithDefaultbookInstances(1000);

	public static int judge(char a,char b)
	{
	  if (a == b)
	  {
		  return (1);
	  }
	  else
	  {
		  return (0);
	  }
	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		int y;
		int zhi;
		int num;
		char[] writer1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	char[] writer2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

	for (i = 0;i < 26;i++)
	{
	writer2[i] = i + 65;
	}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shu[i].num = Integer.parseInt(tempVar2);
			}
		shu[i].zhuzhe = new Scanner(System.in).nextLine();
		}
	for (i = 0;i < n;i++)
	{
	 for (j = 0;shu[i].zhuzhe.charAt(j) != '\0';j++)
	 {
	  for (y = 0;y < 26;y++)
	  {
		  if (writer2[y] == shu[i].zhuzhe.charAt(j))
		  {
			  writer1[y] = writer1[y] + 1;
		  }
	  }
	 }
	}
	zhi = 0;
	num = 0;
	for (i = 0;i < 26;i++)
	{
	if (writer1[i] > zhi)
	{
		zhi = writer1[i];
		num = i;
	}
	}


	for (i = 0;i < n;i++)
	{
	  for (j = 0;shu[i].zhuzhe.charAt(j) != '\0';j++)
	  {
		 if (judge(shu[i].zhuzhe.charAt(j), writer2[num]) == 1)
		 {
			 shu[i].let = 1;
		 }
	  }
	}

	System.out.printf("%c\n",writer2[num]);
	System.out.printf("%d\n",writer1[num]);
	for (i = 0;i < n - 1;i++)
	{
	if (shu[i].let == 1)
	{
		System.out.printf("%d\n",shu[i].num);
	}
	}
	if (shu[n - 1].let == 1)
	{
		System.out.printf("%d",shu[n - 1].num);
	}
	}

}

