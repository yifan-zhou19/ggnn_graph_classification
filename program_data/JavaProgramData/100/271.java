package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[1000];
		char m;
		String b = new String(new char[1000]);
		String c = new String(new char[1000]);
	  b = new Scanner(System.in).nextLine();
	  j = 0;
	  for (i = 0;i < b.length();i++)
	  {
		  if (b.charAt(i) > 96 && b.charAt(i) < 123)
		  {
			  for (k = 0;k < j;k++)
			  {
				  if (b.charAt(i) == c.charAt(k))
				  {
					  a[k]++;
					  break;
				  }
			  }
	  if (k == j)
	  {
		  c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(i));
		  a[j]++;
		  j++;
	  }
		  }
	  }
	  for (i = 0;i < j;i++)
	  {
		  for (k = 0;k < j - 1;k++)
		  {
			  if (c.charAt(k) > c.charAt(k + 1))
			  {
			  m = c.charAt(k);
			  c = tangible.StringFunctions.changeCharacter(c, k, c.charAt(k + 1));
			  c = tangible.StringFunctions.changeCharacter(c, k + 1, m);
			  n = a[k];
			  a[k] = a[k + 1];
			  a[k + 1] = n;
			  }
		  }
	  }
	  if (j == 0)
	  {
		  System.out.print("No\n");
	  }
	  else
	  {
		  for (i = 0;i < j;i++)
		  {
		  System.out.printf("%c=%d\n",c.charAt(i),a[i]);
		  }
	  }





	  return 0;
	}
}

