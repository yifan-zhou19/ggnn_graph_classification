package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int[] s = new int[300];
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
		s[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 1,k = 1;i < n;i++)
	{
	for (j = 0;j < k;j++)
	{
	if (s[j] == s[i])
	{
	break;
	}
	}
	if (j == k)
	{
	s[k] = s[i];
	k++;
	}
	}
	System.out.printf("%d",s[0]);
	for (i = 1;i < k;i++)
	{
	System.out.printf(",%d",s[i]);
	}
	return 0;
	}


}

