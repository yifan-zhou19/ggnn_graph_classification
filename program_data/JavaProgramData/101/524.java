package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int logicA;
		int logicB;
		int logicC;
		int eatA;
		int eatB;
		int eatC;
		String ABC = new String(new char[3]);
		for (eatA = 1; eatA <= 3; eatA++)
		{
			for (eatB = 1; eatB <= 3; eatB++)
			{
				for (eatC = 1; eatC <= 3; eatC++)
				{
					logicA = ((eatB > eatA) + (eatA == eatC));
					logicB = ((eatA > eatB) + (eatA > eatC));
					logicC = ((eatC > eatB) + (eatB > eatA));
					if (((eatA > eatB && logicA < logicB) || (eatA < eatB && logicA > logicB) || (eatA == eatB && logicA == logicB)) + ((eatA > eatC && logicA < logicC) || (eatA < eatC && logicA > logicC) || (eatA == eatC && logicA == logicC)) + ((eatC > eatB && logicC < logicB) || (eatC < eatB && logicC > logicB) || (eatC == eatB && logicC == logicB)) == 3)
					{
						ABC = tangible.StringFunctions.changeCharacter(ABC, eatA, 'A');
						ABC = tangible.StringFunctions.changeCharacter(ABC, eatB, 'B');
						ABC = tangible.StringFunctions.changeCharacter(ABC, eatC, 'C');
						System.out.print(ABC.charAt(1));
						System.out.print(ABC.charAt(2));
						System.out.print(ABC.charAt(3));
					}
				}
			}
		}

		return 0;

	}
}

