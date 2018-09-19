package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] c1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] c2 = {0, '\0', '\0'};
		char[] c3 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	int m;
	int i;
	int j;
	int l;
	int n1;
	int n2;
	int k;
	int max;
	for (k = 0;k < 10000;k++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
			n1 = c1.length();
			n2 = c2.length();
		c3 = c1;
		for (i = 0,max = c1[0];i < n1;i++)
		{
			if (c1[i] > max)
			{
			max = c1[i];
			m = i;
			}
		else
		{
			max = max;
		}
		}
		   for (j = m + 1,l = 0;j <= i + n2,l < n2;j++,l++)
		   {
			   c1[j] = c2[l];
		   }
		   for (j = m + n2 + 1,l = m + 1;j < n1 + n2,l < n1;j++,l++)
		   {
			   c1[j] = c3[l];
		   }
		System.out.printf("%s\n",c1);
		for (i = 0;i < n1 + n2;i++)
		{
			c1[i] = 0;
		}
		for (i = 0;i < n2;i++)
		{
			c2[i] = 0;
		}
	}
	}


}

