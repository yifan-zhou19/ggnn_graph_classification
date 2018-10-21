package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String setline = new String(new char[400]);
		int[] an = new int[400];
		int[] res = new int[400];
		while ((setline = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int i;
			int j;
			int k;
			int len;
			int len2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an,0,400);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(res,0,400);
			len = setline.length();


			for (i = 0;i < len;i++)
			{
				an[i] = setline.charAt(i) - '0';
			}


			res[0] = an[0] / 13;
			for (i = 0;i < len - 1;i++)
			{
				res[i + 1] = ((an[i] % 13) * 10 + an[i + 1]) / 13; //cout<<(an[i]%13)*10+an[i+1]<<' ';
				an[i + 1] = (an[i] % 13) * 10 + an[i + 1];

			}
			len2 = an[len - 1] % 13;
			if (len == 1)
			{
				System.out.print(0);
			}
			else if (len == 2 && an[1] < 13)
			{
				System.out.print(0);
			}
			else
			{
				i = 0;
			while (res[i] == 0)
			{
				i++;
			}
			for (i;i < len;i++)
			{
			System.out.print(res[i]);
			}
			}
			System.out.print("\n");
			System.out.print(len2);
			System.out.print("\n");

			//for(i=0;i<len;i++) cout<<an[i]<<" ";
		}
		return 0;
	}

}

