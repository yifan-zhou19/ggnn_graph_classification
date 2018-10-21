package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String numa = new String(new char[100]); //???a???b??
	   String numb = new String(new char[100]);
	   int[] na = new int[100];
	   int[] nb = new int[100];
	   int a;
	   int b;
	   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   numa = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int digit_a = 0;
	   int m = 1;
	   int j;
	   while (numa.charAt(digit_a) != 0)
	   {
		  digit_a++;
	   }
	   //??a??????

	   for (j = 1;j < digit_a;j++)
	   {
		m = m * a;
	   }
	   int i;
	   int numd = 0;
	   for (i = 0;i < digit_a;i++)
	   {
		if ((numa.charAt(i) >= 'a') && (numa.charAt(i) <= 'z'))
		{
		 na[i] = numa.charAt(i) - 87;
		}
		if ((numa.charAt(i) >= 'A') && (numa.charAt(i) <= 'Z'))
		{
		 na[i] = numa.charAt(i) - 55;
		}
		if ((numa.charAt(i) >= '0') && (numa.charAt(i) <= '9'))
		{
		 na[i] = numa.charAt(i) - 48;
		}
		numd = numd + m * na[i];
		m = m / a;
	   }
	   //???????numd
	   if (numd == 0)
	   {
		 System.out.print(0);
		 System.out.print("\n");
	   }
	   int k = 0;
	   while (numd != 0)
	   {
		  nb[k] = numd % b;
	   numd = numd / b;
	   if ((nb[k] >= 0) && (nb[k] <= 9))
	   {
		numb = tangible.StringFunctions.changeCharacter(numb, k, nb[k] + 48);
	   }
	   else
	   {
		numb = tangible.StringFunctions.changeCharacter(numb, k, nb[k] + 55);
	   }
	   k++;
	   }
	   //k?b??????
	   int t;
	   for (t = k - 1;t >= 0;t--)
	   {
		System.out.print(numb.charAt(t));
	   }
	   return 0;
	}



}

