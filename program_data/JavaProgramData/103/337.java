package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[1001]);
	   int i;
	   int j;
	   int k;
	   char temp;
	   int[] flag = new int[200];
	   for (i = 0;i <= 199;i++)
	   {
		   flag[i] = 0;
	   }
	   str = new Scanner(System.in).nextLine();
	   i = 1;
	   if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z')
	   {
			   str = tangible.StringFunctions.changeCharacter(str, 0, str.charAt(0) - 'a'+'A');
	   }
	   temp = str.charAt(0);
	   flag[str.charAt(0)] = 1;
	   while (str.charAt(i) != 0)
	   {
		   if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
		   {
			   str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
		   }
		   if (flag[str.charAt(i)] == 0)
		   {
			   System.out.print('(');
			   System.out.print(temp);
			   System.out.print(',');
			   System.out.print(flag[temp]);
			   System.out.print(')');
			   flag[temp] = 0;
			   temp = str.charAt(i);
			   flag[str.charAt(i)] = 1;

		   }
		   else
		   {
			   flag[str.charAt(i)]++;
		   }
		 i++;
	   }

	   if (flag[str.charAt(i - 1)] != 0)
	   {
		   System.out.print('(');
		   System.out.print(temp);
		   System.out.print(',');
		   System.out.print(flag[temp]);
		   System.out.print(')');
	   }
		return 0;
	}
}

