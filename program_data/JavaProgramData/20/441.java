package <missing>;

public class GlobalMembers
{
		public static void Main()
		{
			int index;
			int i;
			String str = new String(new char[11]);
			String substr = new String(new char[4]);
			String w = new String(new char[14]);
			char max;
			while (scanf("%s %s",str,substr) != EOF)
			{
				max = str.charAt(0);
				index = 0;
				for (i = 0;i <= str.length();i++)
				{
					if (str.charAt(i) > max)
					{
						index = i;
					max = str.charAt(i);
					}
				}
					w = tangible.StringFunctions.changeCharacter(w, 0, '\0');
					 strncat(w,str,index + 1);
					w += substr;
					w += str.Substring(index) + 1;
					System.out.printf("%s\n",w);
			}
		}
}

