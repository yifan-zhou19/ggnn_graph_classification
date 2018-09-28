package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int l;
	int m = 1;
	int k = 0;
	int[] num = new int[500];
	String a = new String(new char[502]);
	char[][] b = new char[500][5];
	char[][] max = new char[500][5];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = new Scanner(System.in).nextLine();
	for (i = 0;i < a.length() - n + 1;i++)
	{
		 for (j = 0;j < n + 1;j++)
		 {
			   if (j < n)
			   {
				   b[i][j] = a.charAt(i + j);
			   }
			   else
			   {
				   b[i][j] = '\0';
			   }
		 }
	}
	b[i - 1][n] = '\0';
	//for(i=0;i<strlen(a)-n+1;i++)
	//	printf("b[%d]=%s\n",i,b[i]);
	for (i = 0;i < a.length() - n + 1;i++)
	{
		for (j = i;j < a.length() - n + 1;j++)
		{
			if (strcmp(b[i],b[j]) == 0)
			{
				num[i]++;
			}
		}
		if (num[i] > m)
		{
			  for (l = 0;l < k;l++)
			  {
				 max[l] = "\0";
			  }
			max[0] = b[i];
			k = 1;
			  m = num[i];
		}
		  else if (num[i] == m)
		  {
			  max[k] = b[i];
			  k++;
		  }
	}
	if (m == 1)
	{
		System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",m);
		for (i = 0;i < k;i++)
		{
			 System.out.printf("%s\n",max[i]);
		}
	}
	return 0;
	}
}

