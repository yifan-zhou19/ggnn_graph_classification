package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	int[] a = new int[1000];
	int t;
	int len;
	String b = new String(new char[1000]);
	char k;
	int i;
	int j;

	for (i = 0;i < 1000;i++)
	{
	a[i] = 0;
	}

	s = new Scanner(System.in).nextLine();
	len = s.length();



	for (i = 0;i < len;i++)
	{
					  if (s.charAt(i) - 'Z' > 0)
					  {
					  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 'A'-'a');
					  }
					  //printf("%c",s[i]);

	}

	k = s.charAt(0);
	b = tangible.StringFunctions.changeCharacter(b, 0, s.charAt(0));
	a[0] = 1;
	j = 0;
	if (len == 1)
	{
	System.out.printf("(%c,%d)",b.charAt(0),a[0]);
	}
	else
	{
	 for (i = 1,j = 0;i < len;i++)
	 {
							  if (k == s.charAt(i)) //||k==(s[i]+'A'-'a')||k==(s[i]-'A'+'a'))
							  {
							  a[j]++;
							  }
							  else
							  {
								  j++;
								  a[j] = 1;
								  k = s.charAt(i);
								  b = tangible.StringFunctions.changeCharacter(b, j, s.charAt(i));
							  }


	 }

	 for (i = 0;i <= j;i++)
	 {
	 System.out.printf("(%c,%d)",b.charAt(i),a[i]);
	 }
	}
	}

}

