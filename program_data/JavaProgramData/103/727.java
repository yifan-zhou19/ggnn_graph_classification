//??????(??)
public class yasuohou
{
	public char letter;
	public int count;

}

package <missing>;

public class GlobalMembers
{
	public static yasuohou yasuohou = new yasuohou();
	public static int Main()
	{
		String str = new String(new char[100]);
		yasuohou[] lettercount = tangible.Arrays.initializeWithDefaultyasuohouInstances(100); //struct???????????????????????????[]??????
		int i; //i???????j???????
		int j;
		str = new Scanner(System.in).nextLine();
		//?????
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}


		//??????????????????lettercount[i]
		i = 0;
		j = 0;
		lettercount[j].letter = str.charAt(i);
		lettercount[j].count = 1;
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i + 1) == str.charAt(i)) //????????????lettercount[i]????lettercount[i].count++
			{
				lettercount[j].count++;

			}
			else if (str.charAt(i + 1) != '\0' && str.charAt(i + 1) != str.charAt(i))
			{
				lettercount[j].count++; //???lettercount[j].count??
				j++; //??????lettercount[j]
				lettercount[j].letter = str.charAt(i + 1); //?????letter?str[i+1]?letter
				lettercount[j].count = 1;

			}
			else if (str.charAt(i + 1) == '\0')
			{
				lettercount[j].count++;
			break;
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("(%c%c%d)",lettercount[i].letter,',',(lettercount[i].count) - 1);
		}

		return 0;
	}

}

