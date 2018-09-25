package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[301]);
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] z = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char flag = 0;
		sz = new Scanner(System.in).nextLine();
		for (int i = 0;sz.charAt(i) != '\0';i++)
		{
				if (sz.charAt(i) >= 'a' && sz.charAt(i) <= 'z')
				{
				s[sz.charAt(i) - 'a']++;
				flag++;
				}
				if (sz.charAt(i) >= 'A' && sz.charAt(i) <= 'Z')
				{
										   z[sz.charAt(i) - 'A']++;
										   flag++;
				}
		}
		 for (int i = 0;i < 26;i++)
		 {
				 if (z[i] != 0)
				 {
				 System.out.printf("%c=%d\n",i + 'A',z[i]);
				 }
		 }
		 for (int i = 0;i < 26;i++)
		 {
				 if (s[i] != 0)
				 {
				 System.out.printf("%c=%d\n",i + 'a',s[i]);
				 }
		 }
		 if (flag == 0)
		 {
		 System.out.print("No");
		 }
		 sz = new Scanner(System.in).nextLine();
		return 0;
	}


}
