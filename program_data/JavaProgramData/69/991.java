package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String aa = new String(new char[1000]);
		String bb = new String(new char[1000]);
		String cc = new String(new char[1000]);
		String dd = new String(new char[1000]);
		int i = 0;
		int j = 0;
		int k;
		aa = ConsoleInput.readToWhiteSpace(true).charAt(0);
		bb = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (aa.charAt(i) != '\0')
		{
		i++;
		}
		while (bb.charAt(j) != '\0')
		{
		j++;
		}
		if (i < j)
		{
		k = i;
		i = j;
		j = k;
		dd = aa;
		aa = bb;
		bb = dd;
		}

		for (k = 1;k <= i;k++)
		{
			if (k <= j)
			{
			if (aa.charAt(i - k) + bb.charAt(j - k) - 48 > 57)
			{
			cc = tangible.StringFunctions.changeCharacter(cc, i + 1 - k, aa.charAt(i - k) + bb.charAt(j - k) - 58);
			if (k != i)
			{
			aa.charAt(i - k - 1)++;
			}
			else
			{
				cc = tangible.StringFunctions.changeCharacter(cc, 0, '1');
			}
			}
			else
			{
				cc = tangible.StringFunctions.changeCharacter(cc, i + 1 - k, aa.charAt(i - k) + bb.charAt(j - k) - 48);
				  if (k == i)
				  {
				  cc = null;
				  }
			}
			}
		  else
		  {
			   if (aa.charAt(i - k) > 57)
			   {
				  cc = tangible.StringFunctions.changeCharacter(cc, i - k + 1, aa.charAt(i - k) - 10);
			   if (k != i)
			   {
			   aa.charAt(i - k - 1)++;
			   }
			   else
			   {
				   cc = tangible.StringFunctions.changeCharacter(cc, 0, '1');
			   }
			   }
			   else
			   {
					cc = tangible.StringFunctions.changeCharacter(cc, i - k + 1, aa.charAt(i - k));
					 if (k == i)
					 {
					 cc = tangible.StringFunctions.changeCharacter(cc, 0, '0');
					 }
			   }
		  }
		}
			  j = 0;
			   while ((cc.charAt(j) <= 48 || cc.charAt(j)>57) && j < i)
			   {
			   j++;
			   }
			 for (k = j;k <= i;k++)
			 {
			   System.out.print(cc.charAt(k));
			 }
			   System.out.print("\n");

					   return 0;
	}

}

