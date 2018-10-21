public class bac
	{
	public int num;
	public int d;
	public String a = new String(new char[5]);
	}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		bac[] abb = tangible.Arrays.initializeWithDefaultbacInstances(260);
		bac temp = new bac();
		int i;
		int j;
		int b;
		int k;
		int len;
		int n;
		String str = new String(new char[500]);
		char[] dd = {0, '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		str = new Scanner(System.in).nextLine();
		len = str.length();
		b = len - n;
		for (i = 0;i < 260;i++)
		{
			abb[i].d = 1;
			for (j = 0;j < 5;j++)
			{
				abb[i].a = tangible.StringFunctions.changeCharacter(abb[i].a, j, '\0');
			}
		}
		for (i = 0;i <= b;i++)
		{
			k = i;
			for (j = 0;j < n;j++)
			{
				abb[i].a = tangible.StringFunctions.changeCharacter(abb[i].a, j, str.charAt(k));
				k++;
			}
		//	abb[i].a[j+1]='\0';
		}
		for (i = 0;i < b;i++)
		{
			abb[i].d = 0;
			for (j = i + 1;j <= b;j++)
			{
				if (strcmp(abb[i].a,abb[j].a) == 0)
				{
					abb[i].d++;
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			for (j = 0;j < b - 1 - i;j++)
			{
				if (abb[j].d < abb[j + 1].d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=abb[j];
					temp.copyFrom(abb[j]);
					abb[j] = abb[j + 1];
					abb[j + 1] = temp;

				}
			}
		}
		if (abb[0].d > 0)
		{
			System.out.printf("%d\n",abb[0].d + 1);
			for (i = 0;i < b;i++)
			{
				if (abb[i].d == abb[0].d)
				{
					System.out.printf("%s\n",abb[i].a);
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

