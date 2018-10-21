package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 1;
		int j;
		int m;
		int n;
		int[] a = new int[100];
		String str = new String(new char[1000]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (n = 1;n <= str.length();n++)
		{
			a[n] = 0;
		}

		for (m = 0;m <= str.length() - 1;m++)
		{
		if (str.charAt(m) >= 97 && str.charAt(m) <= 122)
		{
		str = tangible.StringFunctions.changeCharacter(str, m, str.charAt(m) - 32);
		}

		}
	  if (str.length() == 1)
	  {
		   b = tangible.StringFunctions.changeCharacter(b, 1, str.charAt(0));
		   a[1] = 1;
	  }
	   else
	   {
		for (i = 1;i <= str.length() - 1;i++)
		{
		  if (str.charAt(i) == str.charAt(i - 1))
		  {
			  a[k] = a[k] + 1;
			  b = tangible.StringFunctions.changeCharacter(b, k, str.charAt(i - 1));
		  }
		  else
		  {
			  a[k] = a[k] + 1;
			  b = tangible.StringFunctions.changeCharacter(b, k, str.charAt(i - 1));
			  k++;
		  }
		  if (i == str.length() - 1)
		  {
			  a[k] = a[k] + 1;
			  b = tangible.StringFunctions.changeCharacter(b, k, str.charAt(i));
		  }
		}
	   }
		for (j = 1;j <= k;j++)
		{

		System.out.printf("(%c,%d)",b.charAt(j),a[j]);
		}

	}

}

