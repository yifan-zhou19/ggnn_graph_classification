package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int h;
	  int i;
	  int j = 0;
	  int k = 0;
	  int l = 0;
	  int t;
	  int p;
	  int d = 1;
	  String a = new String(new char[500]);
	  int[] b = new int[50];
	  int[] c = new int[50];
	  a = new Scanner(System.in).nextLine();
	  h = a.length();
	  for (i = 0;i <= h;i++)
	  {
	  if (((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z')) || ((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z')))
	  {
		  j++;
	  }
	  if ((a.charAt(i) == ' ') || (a.charAt(i) == '\0'))
	  {
	  l++;
	  c[l] = i;
	  b[l] = j;
	  j = 0;
	  }
	  }
	  for (i = 1;i <= l;i++)
	  {
	   for (j = 1;j <= l - i;j++)
	   {
	   if (b[j] < b[j + 1])
	   {
			   t = b[j];
			   b[j] = b[j + 1];
			   b[j + 1] = t;
			   p = c[j];
			   c[j] = c[j + 1];
			   c[j + 1] = p;
	   }
	   }
	  }
	  for (i = 2;i <= l;i++)
	  {
		  if (c[i] != c[1])
		  {
		  break;
		  }
		  if (c[i] == c[1])
		  {
		  d++;
		  }
	  }
	   for (i = 1;i <= d;i++)
	   {
	   for (j = 1;j <= d - i;j++)
	   {
	   if (c[j] > c[j + 1])
	   {
			   t = b[j];
			   b[j] = b[j + 1];
			   b[j + 1] = t;
			   p = c[j];
			   c[j] = c[j + 1];
			   c[j + 1] = p;
	   }
	   }
	   }
	   d = 0;
		for (i = l - 1;i >= 1;i--)
		{
		  if (b[i] == b[l])
		  {
		  d++;
		  }
		  if (b[i] != b[l])
		  {
		  break;
		  }
		}
	  for (i = c[1] - b[1];i < c[1];i++)
	  {
		  System.out.printf("%c",a.charAt(i));
	  }
	  System.out.print("\n");
		for (i = c[l - d] - b[l - d];i < c[l - d];i++)
		{
		  System.out.printf("%c",a.charAt(i));
		}

	}
}
