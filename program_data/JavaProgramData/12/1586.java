package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] s = new int[20];
	int i = 1;
	int j;
	int k;
	int d = 0;
	  char c;
	  do
	  {
	while (scanf("%d", s[i]))
	{
	c = System.in.read();
	if (c == '\n')
	{
	break;
	}
	i++;
	}
		 for (k = 1;k < i;k++)
		 {
	  for (j = k + 1;j < i;j++)
	  {
	if ((s[k] == 2 * s[j]) || (2 * s[k] == s[j]))
	{
	d++;
	}
	  }

		 }
	 if (s[i] > -1)
	 {
	System.out.printf("%d\n",d);
	 }
	i = 1;
	d = 0;
	  }while (s[i] > -1);
	 return 0;

	}

}
