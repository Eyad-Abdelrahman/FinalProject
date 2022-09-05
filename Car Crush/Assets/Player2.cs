using System.Collections;
using System.Collections.Generic;
using UnityEngine;


public class Player2 : MonoBehaviour
{
    
    Rigidbody2D RB2;
    float playerinput2;
    public float speed2;
    // Start is called before the first frame update
    void Start()
    {
        RB2 = GetComponent<Rigidbody2D>();
    }

    // Update is called once per frame
    private void FixedUpdate()
    {
        move2();
    }
    void move2()
    {
        playerinput2 = Input.GetAxis("Horizontal");
        RB2.velocity = new Vector2(playerinput2 * speed2, 0);
    }
}
     
