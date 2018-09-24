package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[105]);
		String sign = new String(new char[105]);
		String present = new String(new char[105]);
		while (scanf("%s",zfc) > 0)
		{
			//scanf("%s",zfc);
			sign = zfc;
			present = zfc;
			int left = 0;
			int right = 0;
			int m = zfc.length();
			for (int i = 0;i < m;i++)
			{
				if (zfc.charAt(i) == '(')
				{
				   left = 0;
				   right = 0;
				   for (int j = i;j < m;j++)
				   {
					   if (zfc.charAt(j) == '(')
					   {
						  left++;
					   }
					   if (zfc.charAt(j) == ')')
					   {
						  left--;
					   }
					   if (left <= 0)
					   {
						  break;
					   }
				   }
				   if (left > 0)
				   {
					  sign = tangible.StringFunctions.changeCharacter(sign, i, '$');
				   }
				}
				if (zfc.charAt(i) == ')')
				{
				   left = 0;
				   right = 0;
				   for (int j = i;j >= 0;j--)
				   {
					   if (zfc.charAt(j) == '(')
					   {
						  right--;
					   }
					   if (zfc.charAt(j) == ')')
					   {
						  right++;
					   }
					   if (right <= 0)
					   {
						  break;
					   }
				   }
				   if (right > 0)
				   {
					  sign = tangible.StringFunctions.changeCharacter(sign, i, '?');
				   }
				}
			}
			for (int i = 0;i < m;i++)
			{
				if (sign.charAt(i) != '$' && sign.charAt(i) != '?')
				{
				   sign = tangible.StringFunctions.changeCharacter(sign, i, ' ');
				}
			}
			System.out.println(present);
			System.out.println(sign);
		}
		return 0;
	}
}

