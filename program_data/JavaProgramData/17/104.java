package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String b = new String(new char[101]);
		int i;
		int j;
		int k;
		int l;
		int r;
		int len;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
					 l = 0;
					 r = 0;
					 for (i = 0;i < 101;i++)
					 {
									   if (a[i] == 0)
									   {
													len = i;
													break;
									   }
					 }
					 for (i = 0;i < len;i++)
					 {
									   b = tangible.StringFunctions.changeCharacter(b, i, ' ');
					 }
					 b = b.substring(0, len);
					 for (i = 0;i < len;i++)
					 {
									   if (a[i] == '(')
									   {
									   l++;
									   }
									   if (a[i] == ')')
									   {
									   l--;
									   }
									   if (l < 0)
									   {
										   b = tangible.StringFunctions.changeCharacter(b, i, '?');
										   l = 0;
									   }
					 }
					 for (i = 0;i < len;i++)
					 {
									   if (a[len - i - 1] == ')')
									   {
									   r++;
									   }
									   if (a[len - i - 1] == '(')
									   {
									   r--;
									   }
									   if (r < 0)
									   {
										   b = tangible.StringFunctions.changeCharacter(b, len - i - 1, '$');
										   r = 0;
									   }
					 }
					 System.out.print(a);
					 System.out.print("\n");
					 System.out.print(b);
					 System.out.print("\n");
					 for (i = 0;i < 101;i++)
					 {
						 a[i] = 0;
					 }
		}
		return 0;
	}
}

