package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[MAX + 1]);
		String a = new String(new char[MAX + 1]);
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		int i;
		int j = 0;
		for (i = 0;i <= l;i++)
		{

			/*for(j=0;j<l;j++){
			if(s[i]==s[i-1]==' '){
			    continue;
			}
			a[j]=s[i];
			}*/
			if (i != 0)
			{
			if (s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == ' ')
			{
				continue;
			}
			}

			a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
			j++;
		}
		System.out.println(a);
		return 0;
	}

}

