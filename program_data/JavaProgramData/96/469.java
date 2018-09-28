package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int n;
		int t = 0;
		int ok = 0;
		String str = new String(new char[MAX]);
		String output = new String(new char[MAX]);
		str = new Scanner(System.in).nextLine();
		n = str.length();


		while ((k < n))
		{
			t = t * 10 + (str.charAt(k) - '0');
			k++;
				//printf("%d\n",t);
			if (t > 13)
			{
				ok = 1;
				// putchar(output[j-1]);
			}
			if (ok != 0)
			{
				output = tangible.StringFunctions.changeCharacter(output, j, ('0' + t / 13));
				//printf("%d\n",t/13);
				t = t % 13;
				j++;
			}


			//printf("%d\n",(str[n]-'0')*10);

			//printf("%d\n",t);
		}
		output = tangible.StringFunctions.changeCharacter(output, j, '\0');
		if (ok != 0)
		{
		System.out.println(output);
		}
		else
		{
		System.out.print("0\n");
		}
		System.out.printf("%d",t);
		return 0;
	}

}

