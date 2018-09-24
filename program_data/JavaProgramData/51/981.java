package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		String ch = new String(new char[501]); //?????????
		int[] a = new int[500]; //?????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch,'\0',(Character.SIZE / Byte.SIZE));
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		len = ch.length();

			//cout<<len<<endl;
		final String temp1 = "";
		final String temp2 = "";
		int i;
		int j = 0;
		for (i = 0;i < len - n + 1;i++)
		{
			if (a[i] == 0)
			{
				for (k = 0;k < n;k++)
				{
					temp1 = tangible.StringFunctions.changeCharacter(temp1, k, ch.charAt(i + k));
				}
				for (j = i + 1;j < len - n + 1;j++)
				{
					if (a[j] == 0)
					{
						for (l = 0;l < n;l++)
						{
							temp2 = tangible.StringFunctions.changeCharacter(temp2, l, ch.charAt(j + l));
						}
						if (strcmp(temp1,temp2) == 0)
						{
							a[i]++;
							a[j] = -2;
						}
					}
				}
			}
		}


		int m = 0; //??????
			for (i = 0;i < len - n + 1;i++)
			{ //cout<<a[i]<<endl;
				m = Math.max(m,a[i]);
			}
			if (m == 0)
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			else
			{
				System.out.print(m + 1);
				System.out.print("\n");

			for (i = 0;i < len - n + 1;i++)
			{
			if (a[i] == m)
			{
				for (k = 0;k < n;k++)
				{
					System.out.print(ch.charAt(i + k));
				}
				System.out.print("\n");
			}
			}
			}

		return 0;
	}
}

