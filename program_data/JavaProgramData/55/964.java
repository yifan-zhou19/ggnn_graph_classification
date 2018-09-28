package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		String input = new String(new char[100]);
		String output = new String(new char[100]);

		int[] number = new int[100];
		int[] remainder = new int[100];
		int sum = 0;
		int a;
		int b;
		int i;
		int t;
		int l;
		int g = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			input = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = input.length();

		for (i = 0;i < l;i++)

		{

	   if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
	   {

		  number[i] = input.charAt(i) - 'A' + 10;
	   }

	   if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
	   {

		  number[i] = input.charAt(i) - 'a' + 10;
	   }

	   if (input.charAt(i) >= '0' && input.charAt(i) <= '9')
	   {

		  number[i] = input.charAt(i) - '0';
	   }

		}
		for (i = 0;i < l;i++)
		{
			g = 1;
			for (t = 0;t < i;t++)
			{
				g *= a;
			}
			 sum = sum + number[l - 1 - i] * g;
		}

	for (i = 0;i < 100;i++)

	{

					  remainder[i] = sum % b;

					  if (sum / b == 0)
					  {

						   break;
					  }

					 sum = sum / b;

	}
	  t = i + 1;

	  for (i = t - 1;i >= 0; i--)

	  {

		   if (remainder[i] >= 0 && remainder[i] <= 9)
		   {

		output = tangible.StringFunctions.changeCharacter(output, t - i - 1, remainder[i] + '0');
		   }

		if (remainder[i] >= 10 && remainder[i] <= 35)
		{

		output = tangible.StringFunctions.changeCharacter(output, t - i - 1, remainder[i] + 'A' - 10);
		}

	  }
	  output = output.substring(0, t);
	System.out.printf("%s\n",output);

	return 0;

	}


}

