//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
public int[] age = new int[100];
public char[][] ID = new char[100][11];
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass patient = new AnonymousClass();
	public static AnonymousClass ppatient;
	public static int Main()
	{
		ppatient = patient;
		int n;
		int i;
		int j;
		int k;
		int num;
		int m = 0;
		String id = new String(new char[11]);
		char[][] ID_1 = new char[100][11];
		String age_1 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			patient.ID[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			patient.age[i] = Integer.parseInt(tempVar3);
		}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (ppatient.age[i] >= 60)
			{
			ID_1[j] = ppatient.ID[i];
			age_1 = tangible.StringFunctions.changeCharacter(age_1, j, ppatient.age[i]);
			m += 1;
			j++;
			}
		}
		for (j = m - 1;j > 0;j--)
		{
			for (k = 0;k < j;k++)
			{
				if (age_1.charAt(k) < age_1.charAt(k + 1))
				{
				id = ID_1[k + 1];
				ID_1[k + 1] = ID_1[k];
				ID_1[k] = id;
				num = age_1.charAt(k + 1);
				age_1 = tangible.StringFunctions.changeCharacter(age_1, k + 1, age_1.charAt(k));
				age_1 = tangible.StringFunctions.changeCharacter(age_1, k, num);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%s\n",ID_1[i]);
		}
		for (i = 0;i < n;i++)
		{
		if (ppatient.age[i] < 60)
		{
			System.out.printf("%s\n",ppatient.ID[i]);
		}
		}
		return 0;
	}
}

