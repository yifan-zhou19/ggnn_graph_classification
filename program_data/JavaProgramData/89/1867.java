//**********************************************************
//*  ?????4.cpp                                       *
//*  ??????1200012906                                *
//*  ???2012?12?10?                                  *
//*  ???????????                                *
//**********************************************************


//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int know; //?????
	public int known; //?????
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] people = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(10000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j != 0 && i != 0 || j != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			people[i].know++;
			people[j].known++;
		}
		for (i = 0; i < n; i++)
		{
			if (people[i].know == 0 && people[i].known == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

