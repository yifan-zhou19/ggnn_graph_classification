package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		  int i;
		  int n;
		  int c;
		  int d;
		  n = a.length();
		  if (n == 1)
		  {
			 System.out.printf("0\n%c\n",a.charAt(0));
		  }
		  else if (n == 2 && (a.charAt(0) - '0') * 10 + a.charAt(1) - '0' < 13)
		  {
			 System.out.printf("0\n%c%c\n",a.charAt(0),a.charAt(1));
		  }
		  else
		  {
		  c = (a.charAt(0) - '0') * 10 + (a.charAt(1) - '0');
		  b[0] = '0';
		  for (i = 1;i < n;i++)
		  {
			  b[i] = c / 13 + '0';
			  d = c - c / 13 * 13;
			  if (a.charAt(i + 1) == '\0')
			  {
				  break;
			  }
			  else
			  {
				  c = 10 * d + a.charAt(i + 1) - '0';
			  }
		  }

		  int j;
		  int k;
		  for (j = 0;j < n;j++)
		  {
			  if (b[j] != '0')
			  {
				 break;
			  }
		  }
		  for (k = j;k < n;k++)
		  {
			 System.out.printf("%c",b[k]);
		  }
		  System.out.print("\n");
		  System.out.printf("%d\n",d);
		  }
	}

}

