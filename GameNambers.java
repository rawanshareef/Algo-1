public class GameNambers {
//Full Search
static class Node{
    public int Left;
    public int Right;
    public int value;
    public String path;

    public Node(int left, int right)
    {
        Left = left;
        Right = right;
        value = 0;
        path = "";
    }
}
    public static void Iterative(int[] input) {
        Node[] game = new Node[(int)Math.pow(2, input.length)-1];
        game[0] = new Node(0, input.length-1);

        for (int i = 0; i < game.length/2; i++) {
            game[2*i+1] = new Node(game[i].Left +1, game[i].Right);
            game[2*i+2] = new Node(game[i].Left, game[i].Right -1);
        }

        for (int i = game.length/2; i < game.length; i++)
        {
            game[i].value = input[game[i].Left];
            game[i].path =  game[i].Right + "";
        }

        for (int i = game.length/2 - 1; i >= 0; i--) {
            if (input[game[i].Left] - game[2*i+1].value >= input[game[i].Right] - game[2*i+2].value)
            {
                game[i].value = input[game[i].Left] - game[2*i+1].value;
                game[i].path = game[i].Left + "->" + game[2*i+1].path;
            }
            else
            {
                game[i].value = input[game[i].Right] - game[2*i+2].value;
                game[i].path = game[i].Right + "->" + game[2*i+2].path;
            }
        }

        System.out.println("value = " + game[0].value);
        System.out.println("path = " + game[0].path);
    }

    public static void main(String[] args) {
        int[] input = {1,3,6,1,3,6};

        Iterative(input);

    }
}

