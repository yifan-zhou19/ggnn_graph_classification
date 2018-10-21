package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  String a = new String(new char[200]);
	  String b = new String(new char[200]);
	  int[] c = new int[200];
	  int i;
	  int j;
	  int k;
	  int t;
	  int m;
	  int n;
	  while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	  {

		  k = a.length();
		  m = 0;
		  n = 0;
		  for (i = 0;i < k;i++)
		  {
			  System.out.print(a.charAt(i));
			  if (i == k - 1)
			  {
				  System.out.print("\n");
			  }
			  if (a.charAt(i) != '(' && a.charAt(i) != ')')
			  {
				  b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			  }
			  else if (a.charAt(i) == ')')
			  {
				  c[m] = i;
				  m++;
			  } //cout<<i<<" ";
		  }
		n = m; //cout<<n<<endl;
		for (i = 0;i < n;i++)
		{
		   String p = a.charAt(c[i]);
		   t = 0;
		   for (j = 0;j <= c[i];j++)
		   {
			   if (p == '(')
			   {
			   t = 1;
			   b = tangible.StringFunctions.changeCharacter(b, c[i] - j, ' ');
			   b = tangible.StringFunctions.changeCharacter(b, c[i], ' ');
			   a = tangible.StringFunctions.changeCharacter(a, c[i] - j, ' ');
			   break;
			   }
			   else
			   {
				   p--;
			   }
		   }
		   if (t == 0)
		   {
			   b = tangible.StringFunctions.changeCharacter(b, c[i], '?');
		   }
		}
		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) == '(')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '$');
			}
		System.out.print(b.charAt(i));
		if (i == k - 1)
		{
			System.out.print("\n");
		}
		}
	  }
	return 0;
	}

}

