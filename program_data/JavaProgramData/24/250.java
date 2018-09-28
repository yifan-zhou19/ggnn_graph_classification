package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char[][] s = new char[60][60];
	  char c;
	  String d = new String(new char[60]);
	  int[] a = new int[60];
	  int i;
	  int j;
	  int k;
	  int t;

	  for (i = 0;;i++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s[i] = tempVar.charAt(0);
	  }
		  a[i] = String.valueOf(s[i]).length();
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		  if (c == '\n')
		  {
			  break;
		  }
	  }

	  j = i;
		for (i = j;i > 0;i--)
		{
			for (k = 0;k < i;k++)
			{
				if (a[k] > a[k + 1])
				{
				   d = s[k];
			  s[k] = s[k + 1];
			  s[k + 1] = d;
			  t = a[k];
			  a[k] = a[k + 1];
			  a[k + 1] = t;
				}
			}
		}
		  System.out.printf("%s\n%s",s[j],s[0]);



	return 0;
	}

}

