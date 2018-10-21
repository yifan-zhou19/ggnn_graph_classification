package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int len;
		char[] c = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		  System.out.printf("%s\n",c);
		  len = c.length();
		  for (j = len - 1;j >= 0;j--)
		  {
			  if (c[j] != '(' && c[j] != ')')
			  {
				  c[j] = ' ';
			  }
			  if (c[j] == '(' && j == len - 1)
			  {
				  c[j] = '$';
			  }
			  if (c[j] == '(')
			  {
				  k = j;
				  for (m = k;m < len;m++)
				  {
					  if (c[m] == ')')
					  {
						  c[m] = ' ';
						  c[j] = ' ';
						  break;
					  }
				  }
				  if (m == len - 1 && c[len - 1] != ' ')
				  {
					  c[j] = '$';
				  }
			  }
		  }
		  for (j = 0;j < len;j++)
		  {
			  if (c[j] == ')')
			  {
				  c[j] = '?';
			  }
			  if (c[j] == '(')
			  {
				  c[j] = '$';
			  }
		  }
		  System.out.printf("%s\n",c);
		}
	}

}

