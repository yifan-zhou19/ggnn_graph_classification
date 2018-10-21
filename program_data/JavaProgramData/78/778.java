package <missing>;

public class GlobalMembers
{
	public static int Main() //????????????????
	{
		int z; //???
		int q;
		int s;
		int l;
		int i;
		String mark = new String(new char[51]); //????
		for (i = 0;i <= 50;i++)
		{
			mark = mark.substring(0, i); //???
		}
		for (z = 10;z <= 50;z += 10) //????
		{
		   for (q = 10;q <= 50;q += 10)
		   {
								if (q == z)
								{
									continue; //??????????
								}
								for (s = 10;s <= 50;s += 10)
								{
													  if (s == q || s == z)
													  {
														  continue;
													  }
													  for (l = 10;l <= 50;l++)
													  {
																		 if (l == z || l == q || l == s)
																		 {
																			 continue;
																		 }
																		 if ((z + q == s + l) && (z + l >= s + q) && (z + s < q)) //????
																		 {
																											 mark = tangible.StringFunctions.changeCharacter(mark, z, 'z');
																											 mark = tangible.StringFunctions.changeCharacter(mark, q, 'q');
																											 mark = tangible.StringFunctions.changeCharacter(mark, s, 's');
																											 mark = tangible.StringFunctions.changeCharacter(mark, l, 'l');
																											 for (i = 50;i >= 10;i = i - 10)
																											 {
																																   if (mark.charAt(i) != 0)
																																   {
																																   System.out.print(mark.charAt(i));
																																   System.out.print(' ');
																																   System.out.print(i);
																																   System.out.print("\n");
																																   }
																											 }
																		 }
													  }
								}
		   }
		}
		   System.in.read();
		   System.in.read();
		   return 0;
	}


}

